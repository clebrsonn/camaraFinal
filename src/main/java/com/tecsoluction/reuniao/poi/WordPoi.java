package com.tecsoluction.reuniao.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class WordPoi {
	
		private POIFSFileSystem fs = null;  
	    private FileInputStream fis = null;  
	    private HWPFDocument doc = null;  
	      
	    private String arquivoEntrada ;// origem do arquivo  
	    private String arquivoSaida ;   // pasta de saida do arquivo   
	      
	  

		/** 
	     * Cria o arquivo na pasta indicada 
	     * @param arquivoEntrada - endereco do arquivo de entrada (modelo) 
	     * @param arquivoSaida - endereco do arquivo de saida, onde vai ser salvo o relatório 
	     */  
      //construtor
	    public WordPoi(String arquivoEntrada, String arquivoSaida){  
	          
	        this.arquivoEntrada = arquivoEntrada;  
	        this.arquivoSaida = arquivoSaida;  
	          
	        try {  
	              
	            fis = new FileInputStream(arquivoEntrada);  
	            fs = new POIFSFileSystem(fis);  
	            doc = new HWPFDocument(fs);  
	              
	        } catch (FileNotFoundException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }  
	    
	    //getters and setters
	    
	    public String getArquivoEntrada() {
			return arquivoEntrada;
		}


		public void setArquivoEntrada(String arquivoEntrada) {
			this.arquivoEntrada = arquivoEntrada;
		}


		public String getArquivoSaida() {
			return arquivoSaida;
		}


		public void setArquivoSaida(String arquivoSaida) {
			this.arquivoSaida = arquivoSaida;
		}

	      
	      
	    /** 
	     * Metodo responsavel por criar o arquivo na pasta informada como parametro na criacao do objeto 
	     */  
	      
	    public void write(){  
	          
	        FileOutputStream fos;  
	        try {  
	            fos = new FileOutputStream(arquivoSaida);  
	            doc.write(fos);  
	            fis.close();  
	            fos.close();  
	            System.out.println("Arquivo Gerado com Sucesso!!");  
	              
	        } catch (FileNotFoundException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	    }  
	      
	  
	    /** 
	     * METODO USADO PARA SUBSTITUIR UMA TAG POR UMA STRING QUE O PROGRAMADOR DESEJAR 
	     * @param tag 
	     * @param novaPalavra 
	     */  
	    public void replaceTag(String tag, String novaPalavra){  
	          
	            Range range = doc.getRange();  
	            range.replaceText(tag,novaPalavra);  
	              
	  
	    }     

}
