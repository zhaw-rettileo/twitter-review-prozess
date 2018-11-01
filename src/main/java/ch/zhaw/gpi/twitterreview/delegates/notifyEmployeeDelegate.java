
package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *
 * @author leo
 */
@Named ("notifyEmployeeAdapter")
public class notifyEmployeeDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {
        System.out.println((String) de.getVariable("mailMainPart"));
        
    }
    
}
