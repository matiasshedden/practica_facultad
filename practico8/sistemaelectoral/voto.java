package practico8.sistemaelectoral;

import java.time.LocalTime;

public class voto {
    private candidato ca;
    private LocalTime emitido;

    public voto(candidato cand) {
        //voto a un candidato determinado
        this.ca = cand;
        this.emitido = LocalTime.now();
    }
    public voto() {
        this.ca = null;
        this.emitido = LocalTime.now();
    }
    public LocalTime getEmitido() { return emitido; }

    public candidato getCandidato() {
        return this.ca;
    }
}
