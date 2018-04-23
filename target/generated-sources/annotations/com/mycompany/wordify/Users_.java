package com.mycompany.wordify;

import com.mycompany.wordify.PersonGroups;
import com.mycompany.wordify.UsersPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-03T07:56:24")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile CollectionAttribute<Users, PersonGroups> personGroupsCollection;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, UsersPK> usersPK;
    public static volatile SingularAttribute<Users, String> lasName;
    public static volatile SingularAttribute<Users, String> dtype;

}