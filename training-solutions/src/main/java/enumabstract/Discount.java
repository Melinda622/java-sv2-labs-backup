package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return (price * 0.8) * pieces;
        }
    },

    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces > 2) {
                return price * 0.5 + (pieces-1) * (price * 0.75);
            } else {
                return (price * 0.75) * pieces;
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
