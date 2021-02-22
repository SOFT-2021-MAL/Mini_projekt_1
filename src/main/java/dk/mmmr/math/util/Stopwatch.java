package dk.mmmr.math.util;

import java.io.PrintStream;

public class Stopwatch implements AutoCloseable{
    private final PrintStream out;
    private final long nanos = System . nanoTime ();
    public Stopwatch ( PrintStream out) { this .out = out; }
    public Stopwatch () { this ( System .out ); }
    public double step () {
        return ( System . nanoTime () - nanos )/1000000.0;
    }
    @Override
    public void close () {
        out. printf (" %5.6f\n", step ());
    }
}
