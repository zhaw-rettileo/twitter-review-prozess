package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation des Service-Tasls Tweet Senden'
 * 
 * @author leo
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * 1. Die prozessvariable Tweet-Content auslesen.
     * 2. Dieser Text wird in der Konsole ausgegeben. 
     * @param de            Objekt, welches die Verknüpfung zur Process-Engine und aktuellen Execution enthält. 
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String) de.getVariable("tweetContent");
        System.out.println("Tweet: "+tweetContent);
    }
    
}
