package structural.facade.test;

import creational.prototype.model.Employees;
import structural.facade.helper.HelperFacade;
import structural.facade.helper.MySqlHelper;
import structural.facade.helper.OracleHelper;

import java.sql.Connection;

public class TestFacade {
    public static void main(String[] args){
        String tableName = "Employees";

        /* Generating MySql HTML report and Oracle PDF report without using Facade */
        Connection connectionMysql = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, connectionMysql);

        Connection connectionOracle = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, connectionOracle);

        /* Generating MySql HTML report and Oracle PDF report using Facade */
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);



    }

}
