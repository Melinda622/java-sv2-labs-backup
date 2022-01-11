package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan plan= new SketchPlan(100,"Building");
        Plan plan2= new PermitPlan(300,"Building3","Joe","Oxford street");
        Plan plan3= new ConstructionPlan(100,"Building","Jane","Main street",500);

        SketchPlan sketchPlan= new SketchPlan(200,"Building2");
        SketchPlan sketchPlan2= new PermitPlan(300,"Building3","Joe","Oxford street");
        SketchPlan sketchPlan3=new ConstructionPlan(100,"Building","Jane","Main street",500);

        Header header = new PermitPlan(300,"Building3","Joe","Oxford street");
        Header header2=new ConstructionPlan(100,"Building","Jane","Main street",500);

        PermitPlan permitPlan=new PermitPlan(300,"Building3","Joe","Oxford street");
        PermitPlan permitPlan2=new ConstructionPlan(100,"Building","Jane","Main street",500);

        ConstructionPlan constructionPlan=new ConstructionPlan(100,"Building","Jane","Main street",500);

        System.out.println(plan.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println(plan3.getPagesOfDocumentation());

        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation());
        System.out.println(sketchPlan2.getTitle());
        System.out.println(sketchPlan3.getPagesOfDocumentation());
        System.out.println(sketchPlan3.getTitle());

        System.out.println(header.getAddressOfBuilding());
        System.out.println(header.getNameOfClient());
        System.out.println(header2.getAddressOfBuilding());
        System.out.println(header2.getNameOfClient());

        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan2.getTitle());
        System.out.println(permitPlan2.getPagesOfDocumentation());
        System.out.println(permitPlan2.getNameOfClient());
        System.out.println(permitPlan2.getAddressOfBuilding());
        System.out.println(permitPlan2.getHeader());

        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getNameOfClient());
    }
}
