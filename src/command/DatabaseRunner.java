/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author nodira
 */
public class DatabaseRunner {

    
    public static void main(String[] args) {
       Database database = new Database();
       
       Developer developer = new Developer(
               new InsertCommand(database),
               new UpdateCommand(database),
               new SelectCommand(database),
               new DeleteCommand(database)
       );
       
       developer.inserRecord();
       developer.updateRecord();
       developer.selectRecord();
       developer.deleteRecord();
       
       
       
    }
    
}
