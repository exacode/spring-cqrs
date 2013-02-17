package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTablespaceSpcnameIndex is a Querydsl query type for QPgTablespaceSpcnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTablespaceSpcnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTablespaceSpcnameIndex> {

    private static final long serialVersionUID = 1685834068;

    public static final QPgTablespaceSpcnameIndex pgTablespaceSpcnameIndex = new QPgTablespaceSpcnameIndex("pg_tablespace_spcname_index");

    public final SimplePath<Object> spcname = createSimple("spcname", Object.class);

    public QPgTablespaceSpcnameIndex(String variable) {
        super(QPgTablespaceSpcnameIndex.class, forVariable(variable), "pg_catalog", "pg_tablespace_spcname_index");
    }

    @SuppressWarnings("all")
    public QPgTablespaceSpcnameIndex(Path<? extends QPgTablespaceSpcnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_tablespace_spcname_index");
    }

    public QPgTablespaceSpcnameIndex(PathMetadata<?> metadata) {
        super(QPgTablespaceSpcnameIndex.class, metadata, "pg_catalog", "pg_tablespace_spcname_index");
    }

}

