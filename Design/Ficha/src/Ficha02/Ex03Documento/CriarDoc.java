package Ficha02.Ex03Documento;

public class CriarDoc {

        public static Document createDocument(String tipo, String nome, String autor){
            switch (tipo){
                case "texto": return new textDoc(autor,nome);

                case "calculo": return new calcDoc(autor,nome);

                case "apresentacao": return new presDoc(autor,nome);

                default: throw new IllegalArgumentException("invalido" + tipo);
            }
        }
    }

