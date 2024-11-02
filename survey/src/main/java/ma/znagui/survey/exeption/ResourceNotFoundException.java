package ma.znagui.survey.exeption;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }

    public ResourceNotFoundException(String resource,Long id){
        super(String.format("%s avec ID : %d n'existe pas",resource,id));
    }
}
