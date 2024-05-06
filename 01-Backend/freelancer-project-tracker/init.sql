-- Setze die Datenbank, in der die Operationen ausgeführt werden sollen
USE freelancer_project_tracker;

-- Tabellen für Projekte, Aufgaben und Benutzer erstellen
CREATE TABLE Project (
    projectId BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    status VARCHAR(50),
    startDate DATE,
    endDate DATE
);

CREATE TABLE Task (
    taskId BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    projectId BIGINT UNSIGNED,
    title VARCHAR(255),
    description TEXT,
    status VARCHAR(50),
    comments TEXT,
    dueDate DATE,
    userId BIGINT UNSIGNED,
    FOREIGN KEY (projectId) REFERENCES Project(projectId),
    FOREIGN KEY (userId) REFERENCES User(userId)
);

CREATE TABLE User (
    userId BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Seed-Daten für Projekte einfügen
INSERT INTO Project (title, description, status, startDate, endDate)
VALUES
    ('Projekt 1', 'Beschreibung für Projekt 1', 'IN_PROGRESS', '2024-05-01', '2024-06-01'),
    ('Projekt 2', 'Beschreibung für Projekt 2', 'PLANNING', '2024-06-01', '2024-07-01');

-- Seed-Daten für Benutzer einfügen
INSERT INTO User (username, email)
VALUES
    ('benutzer1', 'benutzer1@example.com'),
    ('benutzer2', 'benutzer2@example.com');

-- Seed-Daten für Aufgaben einfügen
INSERT INTO Task (projectId, title, description, status, comments, dueDate, userId)
VALUES
    (1, 'Aufgabe 1 für Projekt 1', 'Beschreibung für Aufgabe 1', 'IN_PROGRESS', 'Kommentar für Aufgabe 1', '2024-05-10', 1),
    (1, 'Aufgabe 2 für Projekt 1', 'Beschreibung für Aufgabe 2', 'TODO', 'Kommentar für Aufgabe 2', '2024-05-15', 2),
    (2, 'Aufgabe 1 für Projekt 2', 'Beschreibung für Aufgabe 1', 'PLANNING', 'Kommentar für Aufgabe 1', '2024-06-10', 1);
