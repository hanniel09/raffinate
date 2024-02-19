package org.avs.raffinate.exceptions.badrequests;

public class ClothesBadRequestException extends RuntimeException{
    public ClothesBadRequestException(String id){
        super("Not found Clothes with id: " + id);
    }
}
