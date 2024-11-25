import express from 'express';
import cors from "cors";
import db from './db.js';

const app = express();

app.use((req, res, next) => {
    res.header('Access-Control-Allow-Origin', '*'); // O puedes especificar un dominio en lugar de '*'
    res.header('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE');
    res.header('Access-Control-Allow-Headers', 'Content-Type');
    next();
});

app.use(express.json());
app.use(cors());

// Ruta para obtener datos de la base de datos
app.get('/datos', async (req, res) => {
    try {
        const [rows] = await db.query('SELECT * FROM productos'); // Cambia "tu_tabla" por el nombre real
        res.json(rows);
    } catch (err) {
        console.error('Error al realizar la consulta:', err.message);
        res.status(500).send('Error al obtener los datos');
    }
});

app.post('/peticion', async (req, res) => {
    const { array } = req.body; // Extrae el arreglo del cuerpo de la solicitud
    if (!Array.isArray(array)) {
        return res.status(400).json({ error: 'El cuerpo debe contener un array' });
    }
    const fechaActual = new Date().toISOString().split('T')[0]; // Fecha actual en formato YYYY-MM-DD

    try {
        // Inserta cada solicitud en la base de datos
        const query = `
            INSERT INTO solicitudes (Solicitante, ID_Producto_Solicitado, cantidad,Fecha)
            VALUES (?, ?, ?,?)
        `;

        for (const solicitud of array) {
            const { Solicitante, ID_Producto_Solicitado, cantidad } = solicitud;

            // Validación de datos
            if (!Solicitante || !ID_Producto_Solicitado || !cantidad) {
                return res.status(400).json({ error: 'Faltan campos en una de las solicitudes' });
            }

            // Ejecutar la consulta para cada solicitud
            await db.query(query, [Solicitante, ID_Producto_Solicitado, cantidad, fechaActual]);
        }

        res.json({ message: 'Solicitudes insertadas correctamente' });
    } catch (err) {
        console.error('Error al insertar solicitudes:', err.message);
        res.status(500).json({ error: 'Error al procesar las solicitudes' });
    }
});

// Endpoint para obtener las solicitudes con información de productos
app.get('/solicitudes', async (req, res) => {
    try {
        // Consulta para obtener las solicitudes y la información de los productos
        const query = `
            SELECT 
                s.id AS solicitud_id,
                p.id as producto_id,
                p.nombre AS producto_nombre,
                p.Precio_Mayoreo,
                s.cantidad,
                s.status
            FROM solicitudes s
            JOIN productos p ON s.ID_Producto_Solicitado = p.id
        `;

        const [rows] = await db.query(query);

        // Si no se encuentran registros
        if (rows.length === 0) {
            return res.status(404).json({ message: 'No hay solicitudes registradas.' });
        }

        // Devolver las solicitudes con los productos relacionados
        res.json(rows);
    } catch (err) {
        console.error('Error al obtener las solicitudes:', err.message);
        res.status(500).json({ error: 'Error al obtener las solicitudes' });
    }
});



app.listen(3000, () => {
    console.log('Servidor corriendo en http://localhost:3000');
});
