package com.sports.platform.u202317002.athletes.domain.models.aggregates;

import com.sports.platform.u202317002.athletes.domain.models.commands.CreateAthleteCommand;
import com.sports.platform.u202317002.athletes.domain.models.valueobjects.AthleteBirthDate;
import com.sports.platform.u202317002.athletes.domain.models.valueobjects.AthleteName;
import com.sports.platform.u202317002.athletes.domain.models.valueobjects.AthleteSport;
import com.sports.platform.u202317002.athletes.domain.models.valueobjects.CityAddress;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Athlete extends AbstractAggregateRoot<Athlete> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Embedded
    private AthleteName name;

    @Embedded
    private AthleteSport sport;

    @Embedded
    private CityAddress cityAddress;

    @Embedded
    private AthleteBirthDate birthDate;

    public Athlete() {
    }
    public Athlete(AthleteName name, AthleteSport sport, CityAddress cityAddress, AthleteBirthDate birthDate) {
        this.name = name;
        this.sport = sport;
        this.cityAddress = cityAddress;
        this.birthDate = birthDate;
    }

    public Athlete(CreateAthleteCommand command) {
        this.name = new AthleteName(command.lastName(), command.firstName());
        this.sport = new AthleteSport(command.sport());
        this.cityAddress = new CityAddress(command.address(), command.city());
        this.birthDate = new AthleteBirthDate(command.birthDate());
    }

}
