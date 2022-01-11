package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb verb=new PhrasalVerb("enni","meg");
        Verb verb2=new PhrasalVerbWithSuffix("utaz","el","nék");

        Preposition preposition=new PhrasalVerb("enni","meg");
        Preposition preposition2=new PhrasalVerbWithSuffix("utaz","el","nék");

        PhrasalVerb phrasalVerb=new PhrasalVerb("enni","meg");
        PhrasalVerb phrasalVerb2=new PhrasalVerbWithSuffix("utaz","el","nék");

        Suffix suffix=new PhrasalVerbWithSuffix("utaz","el","nék");

        PhrasalVerbWithSuffix phrasalVerbWithSuffix=new PhrasalVerbWithSuffix("utaz","el","nék");

        System.out.println(verb.getWord());
        System.out.println(verb2.getWord());

        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());
        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());

        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getWholeWord());
        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWord());
        System.out.println(phrasalVerb2.getWholeWord());

        System.out.println(suffix.getSuffix());

        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
