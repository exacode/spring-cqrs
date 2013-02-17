package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDbRoleSettingDatabaseidRolIndex is a Querydsl query type for QPgDbRoleSettingDatabaseidRolIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDbRoleSettingDatabaseidRolIndex extends com.mysema.query.sql.RelationalPathBase<QPgDbRoleSettingDatabaseidRolIndex> {

    private static final long serialVersionUID = 1726130746;

    public static final QPgDbRoleSettingDatabaseidRolIndex pgDbRoleSettingDatabaseidRolIndex = new QPgDbRoleSettingDatabaseidRolIndex("pg_db_role_setting_databaseid_rol_index");

    public final NumberPath<Long> setdatabase = createNumber("setdatabase", Long.class);

    public final NumberPath<Long> setrole = createNumber("setrole", Long.class);

    public QPgDbRoleSettingDatabaseidRolIndex(String variable) {
        super(QPgDbRoleSettingDatabaseidRolIndex.class, forVariable(variable), "pg_catalog", "pg_db_role_setting_databaseid_rol_index");
    }

    @SuppressWarnings("all")
    public QPgDbRoleSettingDatabaseidRolIndex(Path<? extends QPgDbRoleSettingDatabaseidRolIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_db_role_setting_databaseid_rol_index");
    }

    public QPgDbRoleSettingDatabaseidRolIndex(PathMetadata<?> metadata) {
        super(QPgDbRoleSettingDatabaseidRolIndex.class, metadata, "pg_catalog", "pg_db_role_setting_databaseid_rol_index");
    }

}

