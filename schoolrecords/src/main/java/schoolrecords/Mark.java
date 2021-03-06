package schoolrecords;

public class Mark{

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        if (subject==null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor){
        this.markType=MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return markType.getStringValue()+"("+markType.getNumberValue()+")";
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
