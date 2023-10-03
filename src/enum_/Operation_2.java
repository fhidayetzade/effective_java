package enum_;

public enum Operation_2 {

  PLUS{
      @Override
      public double apply(double a, double b) {
          return a+b;
      }
  },

    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },

    DIVIDE {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    };


    public abstract double apply(double a, double b);

}
