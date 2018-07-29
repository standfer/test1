/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLearn;

import java.io.Serializable;

/**
 *
 * @author ivan_grinenko
 */
public interface Verbose extends Comparable {
    int SILENT = 0;
    int TERSE = 1;
    int NORM = 2;
    int VERBOSE = 3;
    
    void setVerbosity(int verbosityLevel);
    int getVerbosity();
    
}
