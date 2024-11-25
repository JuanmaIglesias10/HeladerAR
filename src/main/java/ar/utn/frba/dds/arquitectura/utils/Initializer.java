package ar.utn.frba.dds.arquitectura.utils;

import ar.utn.frba.dds.modelos.entidades.incidentes.AlertaHeladera;
import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import org.apache.ibatis.jdbc.ScriptRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class Initializer implements WithSimplePersistenceUnit{
    public static void init() throws Exception {
       Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/acceso_alimentario",
                "root",
                "123456"
        );
        ScriptRunner scriptRunner = new ScriptRunner(connection);
        scriptRunner.setSendFullScript(false);
        scriptRunner.setStopOnError(true);
        scriptRunner.runScript(new java.io.FileReader("./src/main/resources/utils/archivo_de_creacion.sql"));
    }
}
