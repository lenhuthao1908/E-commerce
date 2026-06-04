package config.flyway;

import org.flywaydb.core.Flyway;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * FlywayMigrationListener
 *
 * @author haoln
 * @version 01-00
 * @since 6/4/2026
 *
 */
@WebListener
public class FlywayMigrationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("=== START FLYWAY MIGRATION ===");

        Flyway flyway = Flyway.configure()
                .dataSource(
                        "jdbc:postgresql://ep-quiet-mouse-ao9mr3q6-pooler.c-2.ap-southeast-1.aws.neon.tech/neondb"
                                + "?sslmode=require&channelBinding=require",
                        "neondb_owner",
                        "npg_IuiEd2xnsR3H"
                )
                .baselineOnMigrate(true)
                .locations("classpath:db/migration")
                .load();

        flyway.migrate();

        System.out.println("=== FLYWAY DONE ===");
    }
}
