CREATE TABLE doctor(
  id serial PRIMARY KEY,
  nombre VARCHAR(45) NOT NULL,
  especialidad VARCHAR(45) NULL
  );

  CREATE TABLE paciente(
    id serial PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    edad VARCHAR(3) NULL,
    doctor_id INT NOT null,
    FOREIGN KEY (doctor_id) REFERENCES doctor(id)
    );

CREATE TABLE tratamiento(
    id serial PRIMARY KEY,
    descripcion VARCHAR(45) NOT NULL,
    paciente_id INT NOT null,
    FOREIGN KEY (paciente_id) REFERENCES paciente(id)
    );