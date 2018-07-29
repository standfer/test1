/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLearn;

/**
 *
 * @author ivan_grinenko
 */
public abstract class Human implements Verbose {

    int verbosity;
    public Human(){    
    }
    
    @Override
    public void setVerbosity(int verbosityLevel) {
        this.verbosity = verbosityLevel;
    }

    @Override
    public int getVerbosity() {
        return this.verbosity;
    }
    
    
}
