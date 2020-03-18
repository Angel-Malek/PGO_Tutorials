package com.company;

public class Engine {

    int ProductionYear;
    double Power;
    boolean EngineEco;


    public Engine(int ProductionYear, double Power) {
        this.Power = Power;
        this.ProductionYear = ProductionYear;
    }

    public double getPower() {
        return this.Power;
    }

    public void setPower(double Power) {
        this.Power = Power;
    }

    public int getProductionYear() {
        return this.ProductionYear;
    }

    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }


    protected boolean TypeEngine() {
        if (ProductionYear > 2000) {

            if (Power > 20000) {
                System.out.println("Engine is Eco");
                boolean EngineEco = true;
                return this.EngineEco;
            } else {
                //  boolean EngineEco = false;
                System.out.println("Engine is not Eco");
                boolean EngineEco =false;
                return this.EngineEco;
            }
        } else {
            System.out.println("Engine is not Eco");
            boolean EngineEco = false;
            return this.EngineEco;

        }
    }
      public boolean getEco (){ return this.EngineEco; }
}
