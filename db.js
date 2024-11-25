import mysql from 'mysql2/promise';

// Configura los datos de conexión
const db = mysql.createPool({
    host: 'junction.proxy.rlwy.net',
    port: 29606, // Puerto especificado por Railway
    user: 'root', // Usuario predeterminado de MySQL
    password: 'QtAWjFCqytQnVmKsBBLYEsilrJITQstM', // Contraseña proporcionada
    database: 'railway', // Base de datos a conectar
});

// Exporta el pool para su uso en otras partes del proyecto
export default db;
