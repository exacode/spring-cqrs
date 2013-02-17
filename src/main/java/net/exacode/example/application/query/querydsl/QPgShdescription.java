package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShdescription is a Querydsl query type for QPgShdescription
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShdescription extends com.mysema.query.sql.RelationalPathBase<QPgShdescription> {

    private static final long serialVersionUID = -799343860;

    public static final QPgShdescription pgShdescription = new QPgShdescription("pg_shdescription");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public QPgShdescription(String variable) {
        super(QPgShdescription.class, forVariable(variable), "pg_catalog", "pg_shdescription");
    }

    @SuppressWarnings("all")
    public QPgShdescription(Path<? extends QPgShdescription> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shdescription");
    }

    public QPgShdescription(PathMetadata<?> metadata) {
        super(QPgShdescription.class, metadata, "pg_catalog", "pg_shdescription");
    }

}

