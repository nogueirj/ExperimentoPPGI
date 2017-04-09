package test;

import bean.Index;
import bean.Requisitions;
import bean.Services;
import controller.UsersController;
import model.Users;
import org.junit.Test;

/**
 * Created by julionogueira on 07/04/17.
 */
public class TesteRequisition {

    public TesteRequisition(){

    }

    @Test
    public void teste01(){
        System.out.println("Teste 01");

        Index i = new Index();
        i.setName("julio");
        i.setEmail("julio.nogueira@outlook.com");

        Requisitions r = new Requisitions();
        r.setDescription("Requisição de teste");

        r.save();
    }
}
