package main;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import model.EnvioEmail;
import model.GeradorDeRelatorios;

public class Main {
	
	public static void main(String[] args) {
		
		EnvioEmail.enviarEmail();
		/*
		try {
			GeradorDeRelatorios.gerarPdf();
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		*/
		
	}

}
