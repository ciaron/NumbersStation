import numbersstation.*;

NumbersStation ns;
ns = new NumbersStation(this);

//println(ns.testMe());
//println(ns.testArray(5));

int n=5;

int[] vals = new int[n];

for (int i=0; i<100; i++) {
  vals = ns.randomSubdivision(100, n);
  for (int j=0; j<n; j++) {
    if (vals[j]==0) { 
      println(vals);
    }
  }
}

//println(vals);
