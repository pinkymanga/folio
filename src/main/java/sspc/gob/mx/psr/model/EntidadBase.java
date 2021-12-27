package sspc.gob.mx.psr.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class EntidadBase {

    @NotBlank
    @NotNull
    @Column(updatable = false, name = "aud_usuario_alta")
    private String usuarioAlta;

    @Column(updatable = false, name = "aud_fch_alta")
    @CreationTimestamp
    protected LocalDateTime fechaCreacion;

    @NotBlank
    @Column(updatable = false, name = "aud_dir_ip_alta")
    private String ipAlta;

    @NotBlank
    @Column(updatable = false, name = "aud_usuario_modificacion")
    private String usuarioModificador;

    @UpdateTimestamp
    @Column(updatable = false, name = "aud_fch_modificacion")
    protected LocalDateTime ultimaModificacion;

    @NotBlank
    @Column(updatable = false, name = "aud_dir_ip_modificacion")
    private String ipModificacion;
}