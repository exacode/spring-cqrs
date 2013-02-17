package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11573 is a Querydsl query type for QPgToast11573
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11573 extends com.mysema.query.sql.RelationalPathBase<QPgToast11573> {

    private static final long serialVersionUID = -269011067;

    public static final QPgToast11573 pgToast11573 = new QPgToast11573("pg_toast_11573");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11573> pgToast11573Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11573(String variable) {
        super(QPgToast11573.class, forVariable(variable), "pg_toast", "pg_toast_11573");
    }

    @SuppressWarnings("all")
    public QPgToast11573(Path<? extends QPgToast11573> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11573");
    }

    public QPgToast11573(PathMetadata<?> metadata) {
        super(QPgToast11573.class, metadata, "pg_toast", "pg_toast_11573");
    }

}

