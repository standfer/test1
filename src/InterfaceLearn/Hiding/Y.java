/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLearn.Hiding;

/**
 *
 * @author ivan_grinenko
 */
public interface Y extends X {
    int VAL = 2;
    int SUM = VAL + X.VAL;
}
