package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast1262 is a Querydsl query type for QPgToast1262
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast1262 extends com.mysema.query.sql.RelationalPathBase<QPgToast1262> {

    private static final long serialVersionUID = -8676791;

    public static final QPgToast1262 pgToast1262 = new QPgToast1262("pg_toast_1262");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast1262> pgToast1262Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast1262(String variable) {
        super(QPgToast1262.class, forVariable(variable), "pg_toast", "pg_toast_1262");
    }

    @SuppressWarnings("all")
    public QPgToast1262(Path<? extends QPgToast1262> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_1262");
    }

    public QPgToast1262(PathMetadata<?> metadata) {
        super(QPgToast1262.class, metadata, "pg_toast", "pg_toast_1262");
    }

}

