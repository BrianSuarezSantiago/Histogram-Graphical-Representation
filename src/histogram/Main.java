package histogram;

/**
 * Class that instantiates an object of type HistogramDisplay
 * on which to execute() method will be called that makes the
 * frame visible where the histogram is arranged for the
 * graphic display of the histogram.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 */
public class Main {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();

        // Add different values to the histogram
        histogram.increment("gmail.com");
        histogram.increment("yahoo.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("icloud.com");
        histogram.increment("ulpgc.es");
        histogram.increment("icloud.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("mailbox.org");
        histogram.increment("icloud.com");
        histogram.increment("ulpgc.es");
        histogram.increment("icloud.com");
        histogram.increment("outlook.com");
        histogram.increment("yahoo.com");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");

        // Execute histogram
        new HistogramDisplay(histogram).execute();
    }
}