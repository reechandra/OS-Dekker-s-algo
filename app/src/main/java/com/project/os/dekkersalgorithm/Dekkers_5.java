/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.os.dekkersalgorithm;

import android.util.Log;

class UnsafeCounter {
    private int count;
    void increment () { count ++; }
    int get () { return count; }
}

class Dekkers_5 {
    final static int STEPS = 5000000;

    static int i = 0;

    static UnsafeCounter c = new UnsafeCounter ();

    public static void main (String[] args) throws InterruptedException {
        System.out.println("Dekker's Algorithm Demo\n\n");

        // Spawn THREADS threads...
        Thread[] thread = new Thread [2];
        for (i = 0; i < 2; i++) {
            thread[i] = new Thread (new Runnable () {
                int tid = i+1;

                public void run () {
                   // Toast.makeText(this,"Your toast message.",Toast.LENGTH_SHORT).show();
                   Log.i("Output1","Thread "+tid+" has entered\n\n");

                   Log.i("Output2","Running "+tid+"\n\n");
                   // System.out.println("Thread "+tid+" has entered.\n\n");
                   // System.out.println("Running: "+tid+"\n\n");

                  // ...each thread increments the counter STEP times
                    for (int s = 0; s < STEPS; s++) {

                        c.increment();


                    }
                }
            });
            thread[i].start();
        }

        // Wait for the threads to terminate
        for (int i = 0; i < 2; i++) thread[i].join();
        // Print the result.
        System.out.println("The final value of the counter is " + c.get() + ".");
    }
}
