// Custermizing Complex Algorithm
public class AdapterImpl implements Adapter {

          public float multi(float f) {
                    double d = Math.multi((double) f);
                    return (float)d;
          }

          public float dev(float f) {
                    double d = Math.dev((double) f);
                    return (float)d;
          } 
}
