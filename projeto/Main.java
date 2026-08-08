package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        String continuar;

        do {
            System.out.println("\n=== Sistema de Usuários  ===");
            System.out.println("--- Consumidores ---");
            System.out.println("(1) Cadastrar Usuário Comum");
            System.out.println("(2) Cadastrar Usuário Premium");
            System.out.println("--- Criadores de Conteúdo ---");
            System.out.println("(3) Cadastrar Influenciador");
            System.out.println("(4) Cadastrar Streamer");
            System.out.println("(5) Cadastrar Fotógrafo");
            System.out.println("--- Corporativo ---");
            System.out.println("(6) Cadastrar Empresa");
            System.out.println("(7) Cadastrar Empresa Verificada");
            System.out.println("-------------------");
            System.out.println("(8) Listar e Interagir com Todos");
            System.out.println("(0) Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    UsuarioComum uc = new UsuarioComum();
                    System.out.print("Nome do Usuário Comum: ");
                    uc.setNome(sc.next());
                    System.out.println("Infome o seu email:");
                    uc.setEmail(sc.next());
                    System.out.println("senha:");
                    uc.setSenha(sc.next());
                    usuarios.add(uc);
                    System.out.println("Usuário Comum cadastrado com sucesso!");
                    break;

                case 2:
                    UsuarioPremium up = new UsuarioPremium();
                    System.out.print("Nome do Usuário Premium: ");
                    up.setNome(sc.nextLine());
                    usuarios.add(up);
                    System.out.println("Usuário Premium cadastrado com sucesso!");
                    break;

                case 3:
                    Influenciador inf = new Influenciador();
                    System.out.print("Nome do Influenciador: ");
                    inf.setNome(sc.nextLine());
                    System.out.print("Nicho (ex: Moda, Games, Finanças): ");
                    inf.setNicho(sc.nextLine());
                    usuarios.add(inf);
                    System.out.println("Influenciador cadastrado com sucesso!");
                    break;

                case 4:
                    Streamer st = new Streamer();
                    System.out.print("Nome do Streamer: ");
                    st.setNome(sc.nextLine());
                    System.out.print("Plataforma (ex: Twitch, YouTube): ");
                    st.setPlataforma(sc.nextLine());
                    usuarios.add(st);
                    System.out.println("Streamer cadastrado com sucesso!");
                    break;

                case 5:
                    Fotografo fot = new Fotografo();
                    System.out.print("Nome do Fotógrafo: ");
                    fot.setNome(sc.nextLine());
                    System.out.print("Especialidade (ex: Casamentos, Ensaios): ");
                    fot.setEspecialidade(sc.nextLine());
                    usuarios.add(fot);
                    System.out.println("Fotógrafo cadastrado com sucesso!");
                    break;

                case 6:
                    Empresa emp = new Empresa();
                    System.out.print("Razão Social da Empresa: ");
                    emp.setRazaoSocial(sc.nextLine());
                    System.out.print("CNPJ: ");
                    emp.setCnpj(sc.nextLine());
                    usuarios.add(emp);
                    System.out.println("Empresa cadastrada com sucesso!");
                    break;

                case 7:
                    EmpresaVerificada ev = new EmpresaVerificada();
                    System.out.print("Razão Social da Empresa Verificada: ");
                    ev.setRazaoSocial(sc.nextLine());
                    System.out.print("CNPJ: ");
                    ev.setCnpj(sc.nextLine());
                    usuarios.add(ev);
                    System.out.println("Empresa Verificada cadastrada com sucesso!");
                    break;

                case 8:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado no momento.");
                    } else {
                        System.out.println("\n--- Varrendo a Lista de Usuários ---");
                        for (Usuario u : usuarios) {
                            // Imprime de qual classe exata o objeto veio
                            System.out.println("\n> Interagindo com: " + u.getClass().getSimpleName());

                            u.exibirPerfil();

                            // === TESTANDO OS MÉTODOS EXCLUSIVOS DE CADA CLASSE ===
                            if (u instanceof UsuarioComum && !(u instanceof UsuarioPremium)) {
                                ((UsuarioComum) u).visualizarConteudos();
                            } else if (u instanceof UsuarioPremium) {
                                ((UsuarioPremium) u).ativarPremium();
                            }

                            if (u instanceof Empresa && !(u instanceof EmpresaVerificada)) {
                                ((Empresa) u).exibirPerfil();
                            } else if (u instanceof EmpresaVerificada) {
                                ((EmpresaVerificada) u).selarVerificao();
                            }

                            if (u instanceof Influenciador) {
                                ((Influenciador) u).fazerParceria();
                            } else if (u instanceof Streamer) {
                                ((CriadorConteudo) u).criarConteudo();
                            } else if (u instanceof Fotografo) {
                                ((Fotografo) u).publicarFotos();
                            }

                            // === TESTANDO OS CONTRATOS (INTERFACES) ===
                            if (u instanceof Monetizavel) {
                                System.out.println(" [!] Ação de Interface:");
                                ((Monetizavel) u).ativarMonetizacao();
                            }

                            if (u instanceof Transmitivel) {
                                System.out.println(" [!] Ação de Interface:");
                                ((Transmitivel) u).iniciarLive();
                            }

                            if (u instanceof Patrocinado) {
                                System.out.println(" [!] Ação de Interface:");
                                ((Patrocinado) u).receberPatrocinio();
                            }

                            System.out.println("-----------------------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                System.out.print("\nDeseja voltar ao menu principal? (s/n): ");
                continuar = sc.next();
            } else {
                continuar = "n";
            }

        } while (continuar.equalsIgnoreCase("s"));

        sc.close();
    }
}