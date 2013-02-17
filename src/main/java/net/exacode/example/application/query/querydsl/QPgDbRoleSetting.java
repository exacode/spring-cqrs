package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDbRoleSetting is a Querydsl query type for QPgDbRoleSetting
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDbRoleSetting extends com.mysema.query.sql.RelationalPathBase<QPgDbRoleSetting> {

    private static final long serialVersionUID = 246723105;

    public static final QPgDbRoleSetting pgDbRoleSetting = new QPgDbRoleSetting("pg_db_role_setting");

    public final SimplePath<Object[]> setconfig = createSimple("setconfig", Object[].class);

    public final NumberPath<Long> setdatabase = createNumber("setdatabase", Long.class);

    public final NumberPath<Long> setrole = createNumber("setrole", Long.class);

    public QPgDbRoleSetting(String variable) {
        super(QPgDbRoleSetting.class, forVariable(variable), "pg_catalog", "pg_db_role_setting");
    }

    @SuppressWarnings("all")
    public QPgDbRoleSetting(Path<? extends QPgDbRoleSetting> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_db_role_setting");
    }

    public QPgDbRoleSetting(PathMetadata<?> metadata) {
        super(QPgDbRoleSetting.class, metadata, "pg_catalog", "pg_db_role_setting");
    }

}

