package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgSeclabels is a Querydsl query type for QPgSeclabels
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgSeclabels extends com.mysema.query.sql.RelationalPathBase<QPgSeclabels> {

    private static final long serialVersionUID = -1185856875;

    public static final QPgSeclabels pgSeclabels = new QPgSeclabels("pg_seclabels");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final StringPath label = createString("label");

    public final StringPath objname = createString("objname");

    public final NumberPath<Long> objnamespace = createNumber("objnamespace", Long.class);

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public final StringPath objtype = createString("objtype");

    public final StringPath provider = createString("provider");

    public QPgSeclabels(String variable) {
        super(QPgSeclabels.class, forVariable(variable), "pg_catalog", "pg_seclabels");
    }

    @SuppressWarnings("all")
    public QPgSeclabels(Path<? extends QPgSeclabels> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_seclabels");
    }

    public QPgSeclabels(PathMetadata<?> metadata) {
        super(QPgSeclabels.class, metadata, "pg_catalog", "pg_seclabels");
    }

}

