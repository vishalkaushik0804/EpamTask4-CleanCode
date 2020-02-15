package com.vishalkaushik.epamtask4.ConstructionCost;

public class CostEstimate {

    private final double costOfStandardMaterial = 1200;
    private final double costOfAboveStandardMaterial = 1500;
    private final double costOfHighStandardMaterial = 1800;
    private final double costOfHighStandardMaterialAndAutomation = 2500;

    public double getCost(double area, String materialType, boolean automation) throws InvalidMaterialSelect {
        double MaterialCost = getMaterialCost(materialType, automation);

        return (area * MaterialCost);
    }

    private double getMaterialCost(String materialStandard, boolean automation) throws InvalidMaterialSelect {
        if (materialStandard.toLowerCase().equals(MaterialStandards.Standards.standardMaterial.toString().toLowerCase())) {
            return costOfStandardMaterial;
        } else if (materialStandard.toLowerCase().equals(MaterialStandards.Standards.AboveStandardMaterial.toString().toLowerCase())) {
            return costOfAboveStandardMaterial;
        } else {
            boolean material = materialStandard.toLowerCase().equals(MaterialStandards.Standards.HighStandardMaterial.toString().toLowerCase());
            if (material && !automation) {
                return costOfHighStandardMaterial;
            } else if (material && automation) {
                return costOfHighStandardMaterialAndAutomation;
            } else {
                throw new InvalidMaterialSelect("Please Select The Valid Material Standard !!");
            }
        }
    }

}
