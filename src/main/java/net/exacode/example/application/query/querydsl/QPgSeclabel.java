package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgSeclabel is a Querydsl query type for QPgSeclabel
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgSeclabel extends com.mysema.query.sql.RelationalPathBase<QPgSeclabel> {

    private static final long serialVersionUID = 1347219870;

    public static final QPgSeclabel pgSeclabel = new QPgSeclabel("pg_seclabel");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final StringPath label = createString("label");

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public final StringPath provider = createString("provider");

    public QPgSeclabel(String variable) {
        super(QPgSeclabel.class, forVariable(variable), "pg_catalog", "pg_seclabel");
    }

    @SuppressWarnings("all")
    public QPgSeclabel(Path<? extends QPgSeclabel> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_seclabel");
    }

    public QPgSeclabel(PathMetadata<?> metadata) {
        super(QPgSeclabel.class, metadata, "pg_catalog", "pg_seclabel");
    }

}

