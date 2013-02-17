package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthidRolnameIndex is a Querydsl query type for QPgAuthidRolnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthidRolnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgAuthidRolnameIndex> {

    private static final long serialVersionUID = -837184746;

    public static final QPgAuthidRolnameIndex pgAuthidRolnameIndex = new QPgAuthidRolnameIndex("pg_authid_rolname_index");

    public final SimplePath<Object> rolname = createSimple("rolname", Object.class);

    public QPgAuthidRolnameIndex(String variable) {
        super(QPgAuthidRolnameIndex.class, forVariable(variable), "pg_catalog", "pg_authid_rolname_index");
    }

    @SuppressWarnings("all")
    public QPgAuthidRolnameIndex(Path<? extends QPgAuthidRolnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_authid_rolname_index");
    }

    public QPgAuthidRolnameIndex(PathMetadata<?> metadata) {
        super(QPgAuthidRolnameIndex.class, metadata, "pg_catalog", "pg_authid_rolname_index");
    }

}

