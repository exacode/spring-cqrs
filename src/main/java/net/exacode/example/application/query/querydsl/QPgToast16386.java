package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast16386 is a Querydsl query type for QPgToast16386
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast16386 extends com.mysema.query.sql.RelationalPathBase<QPgToast16386> {

    private static final long serialVersionUID = -268864000;

    public static final QPgToast16386 pgToast16386 = new QPgToast16386("pg_toast_16386");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast16386> pgToast16386Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast16386(String variable) {
        super(QPgToast16386.class, forVariable(variable), "pg_toast", "pg_toast_16386");
    }

    @SuppressWarnings("all")
    public QPgToast16386(Path<? extends QPgToast16386> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_16386");
    }

    public QPgToast16386(PathMetadata<?> metadata) {
        super(QPgToast16386.class, metadata, "pg_toast", "pg_toast_16386");
    }

}

