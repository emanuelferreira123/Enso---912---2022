package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

@Path("/soma/{n1}/{n2}")
public class Soma {

    
    @GET
    public double calculaSoma(@PathParam("n1") String n1String, @PathParam("n2") String n2String){
        try {
            double n1 = Double.parseDouble(n1String);
            double n2 = Double.parseDouble(n2String);

            return n1+n2;
            
        }catch(NumberFormatException nfException) {
            throw new BadRequestException("ERRO: o valor inserido precisa ser um número real.");
        }
    }



}
