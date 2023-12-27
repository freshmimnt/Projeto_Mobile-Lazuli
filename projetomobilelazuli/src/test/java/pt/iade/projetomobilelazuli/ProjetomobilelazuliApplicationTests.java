package pt.iade.projetomobilelazuli;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pt.iade.projetomobilelazuli.models.agenda.Agenda;
import pt.iade.projetomobilelazuli.models.agenda.AgendaDao;
import pt.iade.projetomobilelazuli.models.agenda.AgendaRepository;
import pt.iade.projetomobilelazuli.models.contacto.Contacto;
import pt.iade.projetomobilelazuli.models.contacto.ContactoDao;
import pt.iade.projetomobilelazuli.models.contacto.ContactoRepository;
import pt.iade.projetomobilelazuli.models.curso.Curso;
import pt.iade.projetomobilelazuli.models.curso.CursoDao;
import pt.iade.projetomobilelazuli.models.curso.CursoRepository;
import pt.iade.projetomobilelazuli.models.estado.Estado;
import pt.iade.projetomobilelazuli.models.estado.EstadoDao;
import pt.iade.projetomobilelazuli.models.estado.EstadoRepository;
import pt.iade.projetomobilelazuli.models.evento.EventoDao;
import pt.iade.projetomobilelazuli.models.horario.Horario;
import pt.iade.projetomobilelazuli.models.horario.HorarioDao;
import pt.iade.projetomobilelazuli.models.horario.HorarioRepository;
import pt.iade.projetomobilelazuli.models.lembrete.Lembrete;
import pt.iade.projetomobilelazuli.models.lembrete.LembreteDao;
import pt.iade.projetomobilelazuli.models.pamizade.PAmizade;
import pt.iade.projetomobilelazuli.models.pamizade.PAmizadeDao;
import pt.iade.projetomobilelazuli.models.pamizade.PAmizadeRepository;
import pt.iade.projetomobilelazuli.models.tarefa.Tarefa;
import pt.iade.projetomobilelazuli.models.tarefa.TarefaDao;
import pt.iade.projetomobilelazuli.models.teste.Teste;
import pt.iade.projetomobilelazuli.models.teste.TesteDao;
import pt.iade.projetomobilelazuli.models.evento.Evento;
import pt.iade.projetomobilelazuli.models.uc.UC;
import pt.iade.projetomobilelazuli.models.uc.UCDao;
import pt.iade.projetomobilelazuli.models.uc.UCRepository;
import pt.iade.projetomobilelazuli.models.ue.UE;
import pt.iade.projetomobilelazuli.models.ue.UEDao;
import pt.iade.projetomobilelazuli.models.ue.UERepository;
import pt.iade.projetomobilelazuli.models.user.Utilizador;
import pt.iade.projetomobilelazuli.models.user.UtilizadorDao;
import pt.iade.projetomobilelazuli.models.user.UtilizadorRepository;

import java.time.LocalDateTime;

@SpringBootTest
class ProjetomobilelazuliApplicationTests {

	@Autowired
	private UtilizadorDao utilizadorDao;
	@Autowired
	private UtilizadorRepository utilizadorRepository;
	private Utilizador utilizador;

	@Autowired
	private AgendaDao agendaDao;
	@Autowired
	private AgendaRepository agendaRepository;
	private Agenda agenda;

	@Autowired
	private TarefaDao tarefaDao;

	@Autowired
	private TesteDao testeDao;

	@Autowired
	private EventoDao eventoDao;

	@Autowired
	private LembreteDao lembreteDao;

	@Autowired
	private CursoDao cursoDao;
	@Autowired
	private CursoRepository cursoRepository;
	private Curso curso;

	@Autowired
	private ContactoDao contactoDao;
	@Autowired
	private ContactoRepository contactoRepository;
	private Contacto contacto;

	@Autowired
	private EstadoDao estadoDao;
	@Autowired
	private EstadoRepository estadoRepository;
	private Estado estado;

	@Autowired
	private HorarioDao horarioDao;
	@Autowired
	private HorarioRepository horarioRepository;
	private Horario horario;

	@Autowired
	private PAmizadeDao pAmizadeDao;
	@Autowired
	private PAmizadeRepository pAmizadeRepository;
	private PAmizade pAmizade;

	@Autowired
	private UCDao ucDao;
	@Autowired
	private UCRepository ucRepository;
	private UC uc;

	@Autowired
	private UEDao ueDao;
	@Autowired
	private UERepository ueRepository;
	private UE ue;

	/*@Test
	void addUCTeste(){
		curso = cursoRepository.findById(1);
		utilizador = utilizadorRepository.findById(1);
		UC uc = new UC();
		uc.setName("Desenvolvimento de Projeto");
		uc.setSala("Sala 22");
		uc.setProf("Professor Carlos");
		uc.setDesc("");
		uc.setNota("");
		uc.setCurso(curso);
		uc.setUtilizador(utilizador);
		ucDao.save(uc);
	}

	@Test
	void addUtilizadorTeste() {
		curso = cursoRepository.findById(1);
		Utilizador utilizador = new Utilizador();
		utilizador.setName("Martim");
		utilizador.setEmail("martim@gmail.com");
		utilizador.setPassword("senha6998");
		utilizador.setTurma("T02");
		utilizador.setSemestre("2º");
		utilizador.setCurso(curso);
		utilizadorDao.save(utilizador);
	}

	@Test
	void deleteUserTeste(){
		utilizador = utilizadorRepository.findById(3);
		utilizadorDao.delete(utilizador);
	}

	@Test
	void deleteCursoTeste(){
		curso = cursoRepository.findById(2);
		cursoDao.delete(curso);
	}


	@Test
	void addCursoTeste(){
		Curso curso = new Curso();
		curso.setName("Engenharia Informática");
		cursoDao.save(curso);
	}

	@Test
	void addAgendaTeste(){
		utilizador = utilizadorRepository.findById(4);
		Agenda agenda = new Agenda();
		agenda.setName("Agenda 1");
		agenda.setUtilizador(utilizador);
		agendaDao.save(agenda);
	}

	@Test
	void addLembreteTeste(){
		agenda = agendaRepository.findById(2);
		Lembrete lembrete = new Lembrete();
		lembrete.setName("Algo");
		lembrete.setDateTime(LocalDateTime.now());
		lembrete.setDesc("INcrivel");
		lembrete.setFinished(false);
		lembrete.setAgenda(agenda);
		lembreteDao.save(lembrete);
	}

	@Test
	void addTarefaTeste(){
		agenda = agendaRepository.findById(1);
		Tarefa tarefa = new Tarefa();
		tarefa.setName("Projeto Final");
		tarefa.setDateTime(LocalDateTime.of(2023, 12, 10, 18, 0, 0));
		tarefa.setNota("10.5");
		tarefa.setDesc("Entregar o projeto final de Metodologia de Investigação");
		tarefa.setFinished(true);
		tarefa.setAgenda(agenda);
		tarefaDao.save(tarefa);
	}

	@Test
	void addTesteTeste(){
		agenda = agendaRepository.findById(1);
		Teste teste = new Teste();
		teste.setName("Prova de BD");
		teste.setDateTime(LocalDateTime.now());
		teste.setNota("20");
		teste.setDesc("Algo Generico");
		teste.setFinished(false);
		teste.setAgenda(agenda);
		testeDao.save(teste);
	}

	@Test
	void addEventoTeste(){
		utilizador = utilizadorRepository.findById(2);
		Evento evento = new Evento();
		evento.setName("Grupo de Estudo");
		evento.setDateTime(LocalDateTime.now());
		evento.setParti(20);
		evento.setDesc("Algo");
		evento.setFinished(true);
		evento.setUtilizador(utilizador);
		eventoDao.save(evento);
	}*/

}