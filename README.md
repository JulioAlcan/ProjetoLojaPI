# ProjetoLojaPI

Eae pessoal, quando vocês forem criar algo, cria uma nova branch (cada branch será uma versão - ex: Versao-0.2/ Versao-0.3).

Segue ai alguns códigos do Git Bash e suas funções

git init - (localizar repositório e inicia) 

git remote add master + link do repositório - (seleciona o link)

git config --global user.email + "email" - (cadastrar email)

git config --global user.name + "nome"  - (cadastrar nome)

git push -u master master - (envia)

git checkout -b + nome - (criar branchs)

git add . (seleciona todos os arquivos que quer enviar)

git commit -m "confirma" - (confirma)

git push -u Versao-0.1 Versao-0.1 (serve para subir o arquivo //Não esquece de mudar a versão)

git status mostra o status e o que foi modificado

_________________________________________________________________________________________________________

Para subir o arquivo: Vá na pasta que está o projeto atualizado, botão direito e seleciona "git bash here"

-git init 

-git remote add master + link repositorio (se der erro "fatal" é pq já existe e está ok)

-git checkout -b Versao-xx

-git add .

-git commit -m "Versao-xx"

-git push origin Versao-xx (lembrando que Versao-xx é o nome da sua branch e versão dela para controle (0.1, 0.2, 0.3...))

if o passo acima não der certo, tente git push -u Versao-xx Versao-xx 

else, ele irá pedir seu email e senha, sinal que funcionou 

-depois atualiza a pagina e vê se rolou

_________________________________________________________________________________________________________

if(funcionou == true){

system.out.print("Parabéns");

}else{

system.out.print("Chama no whats que a gente tenta ajudar");

}

_______________________________
