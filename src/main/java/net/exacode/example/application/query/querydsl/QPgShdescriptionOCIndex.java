package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShdescriptionOCIndex is a Querydsl query type for QPgShdescriptionOCIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShdescriptionOCIndex extends com.mysema.query.sql.RelationalPathBase<QPgShdescriptionOCIndex> {

    private static final long serialVersionUID = 1703670482;

    public static final QPgShdescriptionOCIndex pgShdescriptionOCIndex = new QPgShdescriptionOCIndex("pg_shdescription_o_c_index");

    public final NumberPath<Long> classoid = createNumber("classoid", Long.class);

    public final NumberPath<Long> objoid = createNumber("objoid", Long.class);

    public QPgShdescriptionOCIndex(String variable) {
        super(QPgShdescriptionOCIndex.class, forVariable(variable), "pg_catalog", "pg_shdescription_o_c_index");
    }

    @SuppressWarnings("all")
    public QPgShdescriptionOCIndex(Path<? extends QPgShdescriptionOCIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shdescription_o_c_index");
    }

    public QPgShdescriptionOCIndex(PathMetadata<?> metadata) {
        super(QPgShdescriptionOCIndex.class, metadata, "pg_catalog", "pg_shdescription_o_c_index");
    }

}

