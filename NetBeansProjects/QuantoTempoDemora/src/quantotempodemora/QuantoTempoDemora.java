/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantotempodemora;

/**
 *
 * @author adaao
 */
public class QuantoTempoDemora {

    private long beginingTime;

    public QuantoTempoDemora(){
        beginingTime = System.currentTimeMillis();
    }
    
    public void finalTime(){
        System.out.printf("Tempo total de execução: %l%n", (System.currentTimeMillis() - beginingTime));
    }    
    
}
