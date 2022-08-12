package histogram;

/**
 * Class that instantiates an object of type HistogramDisplay
 * on which to execute() method will be called that makes the
 * frame visible where the histogram is arranged for the
 * graphic display of the histogram.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        HistogramDisplay histogram = new HistogramDisplay();
        histogram.execute();
    }
}