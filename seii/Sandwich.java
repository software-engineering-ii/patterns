package seii;

class Sandwich implements FastFood{

    private final static Float COST = 10000F;
    private final static String DESCRIPTION = "Sandwich";

    @Override
    public void prepareIngredients( ){ }

    @Override
    public void cook( ){ }

    @Override
    public void serve( ){ }

    @Override
    public Float getCost( ){
        return COST;
    }

    @Override
    public String getDescription( ){
        return DESCRIPTION;
    }

    @Override
    public String toString( ){
        return DESCRIPTION;
    }

}