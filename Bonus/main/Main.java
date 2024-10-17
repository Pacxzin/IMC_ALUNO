package main;

import pessoas.Aluno;
import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Criar um aluno
        Aluno aluno = new Aluno("Pietro leme", "12345678901", 70.0, 1.75, 8.5, 80.0);

        // Verificar CPF
        boolean cpfValido = FuncoesUteis.verificarCpf(aluno.getCpf());
        System.out.println("CPF válido: " + cpfValido);

        // Calcular IMC
        double imc = FuncoesUteis.calcularImc(aluno.getPeso(), aluno.getAltura());
        System.out.printf("IMC de %s: %.2f%n", aluno.getNome(), imc);

        // Avaliar aluno
        String resultado = FuncoesUteis.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Resultado da avaliação: " + resultado);
    }
}