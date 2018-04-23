package com.mycompany.wordify;

import com.mycompany.wordify.Groups;
import com.mycompany.wordify.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-03T07:56:24")
@StaticMetamodel(PersonGroups.class)
public class PersonGroups_ { 

    public static volatile SingularAttribute<PersonGroups, Groups> groups;
    public static volatile SingularAttribute<PersonGroups, Integer> id;
    public static volatile SingularAttribute<PersonGroups, Users> email;

}